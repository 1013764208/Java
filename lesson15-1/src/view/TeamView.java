package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;
import util.TSUtility;

public class TeamView {
    private NameListService listService = new NameListService();
    private TeamService teamService = new TeamService();

    public void enterMainMenu() {


        boolean Flag = true;
        char menuSelection = 0;
        while (Flag) {  // 将选择团队列表时，不显示所有成员列表
            if(menuSelection != '1'){
                listAllEmployee();
            }

            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4): " );
            menuSelection = TSUtility.readMenuSelection();
            switch (menuSelection) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        Flag = false;
                    }
                    break;
            }
        }
    }

    public void listAllEmployee(){
//                          2		马化腾		32		18000.0		架构师		FREE		15000.0		2000		联想T4(6000.0)
        System.out.println("---------------------------------------------开发团队调度软件---------------------------------------------\n");

        Employee[] employees = listService.getEmployees();
        if (employees == null || employees.length == 0){
            System.out.println("公司中没有任何员工的信息");
        }else {
            System.out.println("ID\t\t姓  名\t\t年龄\t\t工资\t\t\t职位\t\t\t状态\t\t\t奖金\t\t\t股票\t\t\t领取设备");

            for(int i = 0; i < employees.length; i++){
                System.out.println(employees[i]);
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public void getTeam(){
        System.out.println("-------------------------------团队成员列表-------------------------------");
        Programmer[] team = teamService.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队目前没有成员");
        } else {
            System.out.println("TID/ID\t\t姓名\t\t\t年龄\t\t工资\t\t\t职位\t\t\t奖金\t\t\t股票");
            for (int i = 0;i<team.length;i++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }
//                          1/2			马化腾		32		18000.0		架构师		15000.0		2000
        System.out.println("------------------------------------------------------------------------");
    }

    public void addMember() {
        System.out.println("----------------------------------添加成员--------------------------------");
        System.out.print("请输入要添加员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee employees = listService.getEmployees(id);
            teamService.addMember(employees);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因: " + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    public void deleteMember(){
        System.out.println("----------------------------------删除成员--------------------------------");
        System.out.print("请输入要删除员工的TID：");
        int memberId = TSUtility.readInt();

        System.out.println("确认是否要删除（Y/N）：");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N'){
            return;
        }
        try {
            teamService.removeMember(memberId);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败：原因" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();

    }
}

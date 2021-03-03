package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

/**
 * 关于开发团队成员的管理：添加、删除
 */
public class TeamService {
    private static int counter = 1; // 给 member赋值
    private int MAX_MEMBER = 5;     // 限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];     // 保存开发团队成员
    private int total; // 记录开发团队中实际人数

    public TeamService() {
        super();
    }

    /**
     * 获取开发团队中所有的成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for(int i = 0; i < team.length ;i++){
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 将指定的员工添加到开发团队中
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        // 成员已满，无法添加
        if(total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        // 该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        // 该员工已在本开发团队中
        if(isExist(e)){
            throw new TeamException("该员工已在本开发团队中");
        }

        // 该员工已是某个团队成员
        Programmer p = (Programmer)e; // 强制类型转换
//        if("BUSY".equals(p.getStatus().getNAME())){
//            throw new TeamException("该员工已是某个团队成员");
//        }else if("VOCATION".equals(p.getStatus().getNAME())){
//            throw new TeamException("vocation");
//        }
        switch (p.getStatus()) { // byte/short/char/int/String/枚举类对象
            case BUSY: throw new TeamException("员工已是某个团队成员");
            case VOCATION: throw new TeamException("该员工正在休假");
        }


        // 团队至多只能有一个架构师
        // 1. 获取team中已有成员中架构师，设计师，程序员人数
        int numOfArch = 0,numOfDes = 0,nuOfPro = 0;
        for (int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer) {
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                nuOfPro++;
            }
        }
        if (p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队至多只能有一个架构师");
            }
        }else if (p instanceof Designer) {
            if (numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else if(p instanceof Programmer){
            if(nuOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        // 将 p 添加到现有的 team 中
        team[total++] = p;  // 传的是地址
        // p属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
    }

    // 判断员工是否在团队中
    private boolean isExist(Employee e) {
        for(int i = 0;i < total;i++){
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 从团队中删除成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for(; i < total; i++){
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        // 为找到指定memberId情况
        if(i == total){
            throw new TeamException("没找到指定memberID的员工，删除失败");
        }

        // 后一个元素覆盖前一个元素，实现删除操作
        for(int j = i; j < total - 1; j++){
            team[j] = team[j+1];
        }
//        写法一
//        team[total-1] = null;
//        total--;
//        写法二
        team[--total] = null;
    }
}

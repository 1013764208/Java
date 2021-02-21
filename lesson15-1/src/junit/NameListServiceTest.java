package junit;
import domain.Employee;
import org.junit.Test;
import service.NameListService;
import service.TeamException;

/**
 * 对 NameListService 的测试
 */

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getEmployees();

        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 20;
        try {
            Employee employee = service.getEmployees(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}

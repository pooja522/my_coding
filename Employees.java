
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpId(108);
		emp.setEmpName("devidas");
		emp.setEmpDesig("developer");
		emp.setEmpDept("RCM");
		emp.Emp();
	}
}
class Employee   
{
    private int empId;
    private String empName;
    private String empDesign;
    private String empDept;
    
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public int getEmpId()
    {
        return empId;
    }
    /**
     * @return
     */
    
    public void setEmpName(String empName)
    {
        if(empName==null){
            throw new NullPointerException("Name should not be Null");
        }
        this.empName=empName;
    }
    public String getEmpName()
    {
        return empName;
        
    }
    
    
    public void setEmpDesig(String empDesign)
    {
        if(!(empDesign=="developer" ||empDesign=="tester"||empDesign=="lead"||empDesign=="manager"))
        {
            System.out.println("Invalid Designation\n");
            empDesign="NULL";
        }
        this.empDesign=empDesign;
        
    }
    public String getEmpDesig()
    {
        return empDesign;
    }
    public void setEmpDept(String empDept)
    {
        if(!(empDept == "TTH" || empDept== "RCM" || empDept=="Digital" || empDept=="Devops"))
        {
            System.out.println("Invalid Dept");
            empDept="NULL";
        }
        this.empDept=empDept;
    }
    public String getEmpDept()
    {
        return empDept;
    }
    
    
    public void Emp()
    {
    	System.out.println("Employee details are as below:");
    	System.out.println("EmpId:"+getEmpId()+"\nEmpName:"+getEmpName()+"\nEmpDesig:"+getEmpDesig()+"\nEmpDept:"+getEmpDept());
      
    }
        
}
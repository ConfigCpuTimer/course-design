package homework5;

/**
 * Created by Forec on 2016/12/5.
 */
public class _14211457_王耀_5_EmployeeBasePlusCommission
        extends _14211457_王耀_5_EmployeeCommission {
    private int baseSalary;
    public _14211457_王耀_5_EmployeeBasePlusCommission(String _firstName,
                                                     String _lastName,
                                                     String _socialSecurityNumber,
                                                     int _grossSales,
                                                     float _commissionRate,
                                                     int _baseSalary){
        super(_firstName, _lastName, _socialSecurityNumber,
                _grossSales, _commissionRate);
        this.baseSalary = _baseSalary;
    }
    public String toString(){
        return "员工类型：_14211457_王耀_5_EmployeeBasePlusCommission   员工名称：" + super.getLastName() +
                " " + super.getFirstName() + "  社会保险号： " +
                super.getSocialSecurityNumber();
    }
    public int earning(){
        return this.baseSalary + super.earning();
    }
    public int getBaseSalary(){
        return this.baseSalary;
    }
    public void setBaseSalary(int _baseSalary){
        this.baseSalary = _baseSalary;
    }
}

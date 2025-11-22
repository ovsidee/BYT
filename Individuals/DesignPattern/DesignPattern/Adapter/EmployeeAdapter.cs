// In case you need some guidance: https://refactoring.guru/design-patterns/adapter
namespace DesignPattern.Adapter
{
    public class EmployeeAdapter : ITarget
    {
        private readonly BillingSystem thirdPartyBillingSystem = new();
        
        public void ProcessCompanySalary(string[,] employeesArray)
        { 
            var emps = new List<Employee>();
            for (int i = 0; i < employeesArray.GetLength(0); i++)
            {
                int id = int.Parse(employeesArray[i, 0]);
                string name = employeesArray[i, 1];
                string designation = employeesArray[i, 2];
                decimal salary = decimal.Parse(employeesArray[i, 3]);
                emps.Add(new Employee(id, name, designation, salary));
            }
            thirdPartyBillingSystem.ProcessSalary(emps);
        }
    }
}
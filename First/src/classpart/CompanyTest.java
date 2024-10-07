package classpart;

public class CompanyTest {
    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();

        System.err.println(myCompany1 == myCompany2);
    }
}

interface Details
{
    void Stu_detail();
}
interface Persionl_detail
{
    void Stu_address();
}
public class Stu implements Details, Persionl_detail {
    public void Stu_detail() {
        System.out.println("NAME:Kani");
    }

    public void Stu_address() {
        System.out.println("!7a,north street");
    }
}

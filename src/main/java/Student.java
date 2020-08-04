public class Student {
    private int sid;
    private String sname;
    private String sclass;

    public Student() {
    }

    public Student(int sid, String sname, String sclass) {
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
    }

    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return this.sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclass='" + sclass + '\'' +
                '}';
    }
}

package finalPractice.overrideHashCode.Lesson11.HashTable;

public class Course {
    String cid;
    String cname;
    public Course(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + "]";
    }
}
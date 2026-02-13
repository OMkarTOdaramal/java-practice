public class Magazine extends LibraryResource{
    
    String title;
    int issue_number;
    String month;

    @Override
    public String getDetails() {
        return "Magazine: " + title + "Issue Number: " + issue_number + "Month: " + month;
    }

    public Magazine(String title,int issue_number,String month){
        this.title = title;
        this.issue_number = issue_number;
        this.month = month;
    }
}

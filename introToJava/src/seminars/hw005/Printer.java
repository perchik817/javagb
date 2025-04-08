package seminars.hw005;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //printer.task01();
        printer.task02();
    }

    private void task02(){
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.getHistory());
    }

    private void task01(){
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);
        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice")); //[90, 95]
        System.out.println(directory.getAllStudents()); //{Bob=[85], Alice=[90, 95]}
        directory.removeStudent("Alice");
        System.out.println("After removal:");

        System.out.println(directory.findStudent("Alice")); //[]
        System.out.println(directory.getAllStudents()); //{Bob=[85]}
    }
}
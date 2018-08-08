public enum Book {
    // declare constants of enum type
    JHTP("Java How to Program", "2012"), CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program", "2008"), CPPHTP("C++ How to Program", "2012"),
    VBHTP("Visual Basic 2010 How to Program", "2011"), CSHARPHTP("Visual C# 2010 How to Program", "2011");

    private final String title;
    private final String copyrightYear;
    
    // enum constructor
    Book(String bookTitle, String year){
        title = bookTitle;
        copyrightYear = year;
    }

    // accessor for field title
    public String getTitle(){
        return title;
    }

    // accessor for field copyrightYear
    public String getCopyrightYear() {
        return copyrightYear;
        
    }

}
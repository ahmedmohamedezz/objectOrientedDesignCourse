public abstract class DataMiner {
    // steps of mining file's data : open file -> extract -> parse -> analyse -> send report -> close file
    public void openFile(){
        System.out.println("opening file");
    }

    public abstract void extract() ;
    public abstract void parse() ;

    public void analyse(){
        System.out.println("analysing data");
    }

    public void report(){
        System.out.println("Sending report");
    }

    public void closeFile(){
        System.out.println("closing file");
    }

    // template method
    public final void mineFileData(){
        openFile();
        extract();
        parse();
        analyse();
        report();
        closeFile();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataMiner dataMiner ;
        while(true){
            System.out.println("choose the type of file  , or enter -1 to stop mining data");
            System.out.println("1. PDF");
            System.out.println("2. CSV");
            System.out.println("3. DOC");
            Scanner input = new Scanner(System.in) ;
            int choice = input.nextInt() ;
            switch (choice){
                case 1 : dataMiner = new PDFDataMiner() ;
                break;
                case 2 : dataMiner = new CSVDataMiner() ;
                break;
                case 3 : dataMiner = new DOCDataMiner() ;
                break;
                default:
                    return;
            }
            dataMiner.mineFileData();
        }
    }
}
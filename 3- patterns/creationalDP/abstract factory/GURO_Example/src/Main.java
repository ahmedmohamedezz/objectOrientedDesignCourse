import Factories.AbstractFactory;
import Factories.MacOsFactory;
import Factories.WindowsFactory;
import UIElements.Button;
import UIElements.CheckBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the OS used ?");
        System.out.println("1. Windows");
        System.out.println("2. Mac");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt() ;
        AbstractFactory factory ;
        switch (choice){
            case 1: factory = new WindowsFactory() ;
            break;
            case 2: factory = new MacOsFactory() ;
            break;
            default:{
                throw new RuntimeException("Undefined OS") ;
            }
        }
        Button button = factory.renderButton() ;
        CheckBox checkBox = factory.renderCheckBox() ;

        button.render();
        checkBox.render();
    }
}
package Factories;

import UIElements.Button;
import UIElements.CheckBox;
import UIElements.WindowsButton;
import UIElements.WindowsCheckBox;

public class WindowsFactory implements AbstractFactory{
    @Override
    public Button renderButton(){
        return new WindowsButton() ;
    }
    @Override
    public CheckBox renderCheckBox(){
        return new WindowsCheckBox() ;
    }
}

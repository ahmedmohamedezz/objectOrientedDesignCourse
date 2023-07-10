package Factories;

import UIElements.*;

public class MacOsFactory implements AbstractFactory{
    @Override
    public Button renderButton(){
        return new MacOSButton() ;
    }
    @Override
    public CheckBox renderCheckBox(){
        return new MacOSCheckBox() ;
    }
}

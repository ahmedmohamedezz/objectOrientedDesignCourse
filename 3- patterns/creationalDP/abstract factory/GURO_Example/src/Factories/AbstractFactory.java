package Factories;

import UIElements.Button;
import UIElements.CheckBox;

public interface AbstractFactory {
    public Button renderButton() ;
    public CheckBox renderCheckBox() ;
}

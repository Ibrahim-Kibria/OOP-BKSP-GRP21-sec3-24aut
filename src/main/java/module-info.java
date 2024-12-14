module csc213.cse213_finalproject_group21_bksp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens csc213.cse213_finalproject_group21_bksp to javafx.fxml;
    exports csc213.cse213_finalproject_group21_bksp;
    exports csc213.cse213_finalproject_group21_bksp.kibria;
    opens csc213.cse213_finalproject_group21_bksp.kibria to javafx.fxml;
}
module org.example.sdp_endterm_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sdp_endterm_project to javafx.fxml;
    exports org.example.sdp_endterm_project;
}
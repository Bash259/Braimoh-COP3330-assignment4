/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainApp extends Application{
            public static void main(String[] args) {
                launch(args);
            }
            @Override
            public void start(Stage primaryStage){
                Parent root = null;
                try {
                   root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
           @FXML
            void ListDelete(ActionEvent event) {
                //Implement a search bar
                //Take user input
                //Use the user input to iterate through the gson object list and look for a match
                //delete the matched list
                //or print a not found message
            }

            @FXML
            void ToDoListCollector(ActionEvent event) {
            /*
            Cover the following in a while(true) loop
            request for Todo List name
            request for the tasks and the date to be completed by
            Make an gson array (superArrayList) list to store all the Todo list names and store another gson array list (subArrayList) that contains the task and the date to be completed
            Let the name be the object in the superArrayList
            make another array list for the tasks and dates to be completed by in the object and key spaces in the new array list(Let this be for the key of the super array list)
            ask a question do you want to add another Todo list y/n?
            add an if statement if the answer is yes continue the loop
            else if the answer is no display a thank you message and break from the loop
            */
            }

            @FXML
            void ToDoListEditor(ActionEvent event) {
                //Implement a search bar
                //Take user input
                //Use the user input to iterate through the gson object list and look for a match
                //prompt for a string entry
                //or print a not found message
                //use the entered string to replace the old string
            }

            @FXML
            void ToDoListLoader(ActionEvent event) {
                //implement a search bar
                //use the user input to pull a .txt file from a folder that stores them all
                //uses br reader to read the to do list from the Todo.txt
                //prints out the file line by line
            }
        }
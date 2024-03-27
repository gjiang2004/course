/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
/**
 *
 * @author glen
 */
public interface RMIInterface extends Remote {
    public static final int port = 9999;
    
    public void addSemester(String name) throws RemoteException;
    public ArrayList<String> getSemesterList() throws RemoteException;
    
    public void addStudent(StudentEntry student) throws RemoteException;
}

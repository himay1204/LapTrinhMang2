package controller;

import java.awt.Point;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import view.ChangePasswordFrm;
import view.DashboardFrm;
import view.DeleteAccountFrm;
import view.RoomSearchFrm;
import view.LoginFrm;
import view.RegisterFrm;
import view.FloorSearchFrm;
import view.ModifyRoomFrm;
import view.AddFloorFrm;
import view.ModifyFloorFrm;

public class Client {

    public static LoginFrm loginFrm;
    public static SocketHandle socketHandle;
    public static DatagramSocket socket;
    public static RegisterFrm registerFrm;
    public static DashboardFrm dashboardFrm;
    public static DeleteAccountFrm deleteAccountFrm;
    public static ChangePasswordFrm changePasswordFrm;
    public static FloorSearchFrm floorSearchFrm;
    public static RoomSearchFrm roomSearchFrm;
    public static ModifyRoomFrm modifyRoomFrm;
    public static AddFloorFrm addFloorFrm;
    public static ModifyFloorFrm modifyFloorFrm;
    public static Point lastLocation = new Point(0, 0);
    public static String adminName;

    public Client() {
        try {
            socket = new DatagramSocket();
            loginFrm = new LoginFrm();
            loginFrm.setVisible(true);
            socketHandle = new SocketHandle(socket);
            socketHandle.run();
        } catch (SocketException | UnknownHostException e) {
            System.out.println(e);
        }
    }

    public static void OpenView(View viewName) {
        switch (viewName) {
            case LOGIN:
                loginFrm = new LoginFrm();
                loginFrm.setLocation(lastLocation);
                loginFrm.setVisible(true);
                break;
            case REGISTER:
                registerFrm = new RegisterFrm();
                registerFrm.setLocation(lastLocation);
                registerFrm.setVisible(true);
                break;
            case ROOM_SEARCH:
                roomSearchFrm = new RoomSearchFrm();
                roomSearchFrm.setLocation(lastLocation);
                roomSearchFrm.setVisible(true);
                break;
            case FLOOR_SEARCH:
                floorSearchFrm = new FloorSearchFrm();
                floorSearchFrm.setLocation(lastLocation);
                floorSearchFrm.setVisible(true);
                break;
            case MODIFY_ROOM:
                modifyRoomFrm = new ModifyRoomFrm();
                modifyRoomFrm.setLocation(lastLocation);
                modifyRoomFrm.setVisible(true);
                break;
            case DASHBOARD:
                dashboardFrm = new DashboardFrm();
                dashboardFrm.setLocation(lastLocation);
                dashboardFrm.setVisible(true);
                break;
            case DELETEACCOUNT:
                deleteAccountFrm = new DeleteAccountFrm();
                deleteAccountFrm.setLocation(lastLocation);
                deleteAccountFrm.setVisible(true);
                break;
            case CHANGEPASSSWORD:
                changePasswordFrm = new ChangePasswordFrm();
                changePasswordFrm.setLocation(lastLocation);
                changePasswordFrm.setVisible(true);
                break;
            default:
                throw new AssertionError("View not handled: " + viewName);
        }
    }

    public static void CloseView(View viewName) {
        switch (viewName) {
            case LOGIN:
                lastLocation = loginFrm.getLocation();
                loginFrm.dispose();
                break;
            case REGISTER:
                lastLocation = registerFrm.getLocation();
                registerFrm.dispose();
                break;
            case ROOM_SEARCH:
                lastLocation = roomSearchFrm.getLocation();
                roomSearchFrm.dispose();
                break;
            case FLOOR_SEARCH:
                lastLocation = floorSearchFrm.getLocation();
                floorSearchFrm.dispose();
                break;
            case MODIFY_ROOM:
                lastLocation = modifyRoomFrm.getLocation();
                modifyRoomFrm.dispose();
                break;
            case DASHBOARD:
                lastLocation = dashboardFrm.getLocation();
                dashboardFrm.dispose();
                break;
            case DELETEACCOUNT:
                lastLocation = deleteAccountFrm.getLocation();
                deleteAccountFrm.dispose();
                break;
            case CHANGEPASSSWORD:
                lastLocation = changePasswordFrm.getLocation();
                changePasswordFrm.dispose();
                break;
            default:
                throw new AssertionError("View not handled: " + viewName);
        }
    }

    public static void OpenUpdateRoomView(String tenphong, String tang) {
        modifyRoomFrm = new ModifyRoomFrm(tenphong, tang);
        modifyRoomFrm.setLocation(lastLocation);
        modifyRoomFrm.setVisible(true);
    }

    public enum View {
        LOGIN,
        REGISTER,
        DASHBOARD,
        DELETEACCOUNT,
        CHANGEPASSSWORD,
        FLOOR_SEARCH,
        ROOM_SEARCH,
        MODIFY_ROOM
    }

    public static void main(String[] args) {
        new Client();
    }
}

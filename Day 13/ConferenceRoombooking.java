package Threads;

public class ConferenceRoombooking {

    private boolean isRoomAvailable = true; 

    
    public synchronized void bookRoom(String managerName) {
        if (isRoomAvailable) {
            System.out.println(managerName + " booked the room.");
            isRoomAvailable = false; 
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(managerName + " finished the meeting.");
            isRoomAvailable = true; 
        } else {
            System.out.println(managerName + " found the room unavailable.");
        }
    }

    
    static class Manager extends Thread {
        private final ConferenceRoombooking bookingSystem;
        private final String managerName;

        public Manager(ConferenceRoombooking bookingSystem, String managerName) {
            this.bookingSystem = bookingSystem;
            this.managerName = managerName;
        }

        @Override
        public void run() {
            bookingSystem.bookRoom(managerName);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConferenceRoombooking bookingSystem = new ConferenceRoombooking();

        
        Manager manager1 = new Manager(bookingSystem, "Manager 1");
        Manager manager2 = new Manager(bookingSystem, "Manager 2");

       
        manager1.start();
        manager2.start();

        
        manager1.join();
        manager2.join();

        System.out.println("Conference room booking system has finished.");
    }
}

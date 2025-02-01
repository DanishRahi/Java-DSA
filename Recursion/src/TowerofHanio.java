public class TowerofHanio {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Base case: If there's only one disk, move it from source to destination
        if (disks == 1) {
            System.out.println(source + "" + destination);
            return;
        }

        // Move (n-1) disks from source to auxiliary using destination as the auxiliary rod
        towerOfHanoi(disks - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println(source + "" + destination);

        // Move the (n-1) disks from auxiliary to destination using source as the auxiliary rod
        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // You can change the value of n as per your requirement
        towerOfHanoi(n, 'a', 'b', 'c');
    }
}

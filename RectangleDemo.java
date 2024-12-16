package labprograms;
import java.util.Scanner;

class Rectangle implements Resizable {
    private int height;
    private int width;
    
    public Rectangle() {
    }
    
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public void resizeHeight(int height) {
        this.height = height;
    }
    
    public void resizeWidth(int width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "height: " + this.height + " width: " + this.width;
    }
}

interface Resizable {
    void resizeHeight(int height);
    void resizeWidth(int width);
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height and width of the rectangle:");
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println(rectangle);
        
        System.out.println("Enter the new height and width:");
        int newHeight = scanner.nextInt();
        int newWidth = scanner.nextInt();
        
        rectangle.resizeHeight(newHeight);
        rectangle.resizeWidth(newWidth);
        System.out.println(rectangle);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame{
    int WIDTH = 800;
    int HEIGHT = 600;
    
    public Main() {
        super("Zasrane PBW");
        
        this.setLayout(new GridBagLayout());
        
        

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(50,50,50,50);
        constraints.ipadx = 10;
        constraints.ipady = 10;
        constraints.gridx = 0;
        constraints.gridy = 0;
       // JLabel jLabel = new JLabel(new ImageIcon(image));
        this.add(new label(),constraints);
        //jLabel.add
        constraints.gridx = 1;
        constraints.gridy = 0;
        this.add(new label(),constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(new label(),constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(new label(),constraints);

        
        this.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private class label extends JLabel {
        String path = "/home/j/workspace/java/pbw/includes/bird.jpg";

        public label() {
            ImageIcon imageIcon = new ImageIcon(path);
          //  thi
           // Image image = Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(200,150, Image.SCALE_SMOOTH);
            this.setIcon(imageIcon);
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    System.out.println("cos sie bedzie otwierac");
                }
            });
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Main();
    }
}


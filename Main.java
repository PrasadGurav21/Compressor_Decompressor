import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class Main implements ActionListener {
    JFrame frame;
    JButton compressButton;
    JButton decompressButton;
    Main(){
        frame = new JFrame("COMPRESSOR_DECOMPRESSOR");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(800,500);

        compressButton=new JButton("Select file to compress");
        compressButton.setBounds(180,100,200,30);
        // compressButton.setBackground(Color.yellow);
        compressButton.addActionListener(this);
        // compressButton.setLocation(400,400);

        decompressButton=new JButton("Select file to decompress");
        decompressButton.setBounds(400,100,200,30);
        decompressButton.addActionListener(this);


        frame.add(compressButton);
        frame.add(decompressButton);
        frame.setSize(800,500);
        //  this.getContentPane().setBackground(Color.yellow);
    }
    public static void main(String[] args) {
        Main object = new Main ();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==decompressButton){
            JFileChooser fileChooser=new JFileChooser();
            int responce = fileChooser.showSaveDialog(null);
            if(responce==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }
        }
        if(e.getSource()==compressButton){
            JFileChooser fileChooser=new JFileChooser();
            int responce = fileChooser.showSaveDialog(null);
            if(responce==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }
        }
    }
}
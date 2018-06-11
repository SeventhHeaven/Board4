// Board4.java

import javax.swing.*;
import java.awt.*;
import java.util.*;

class  Board4 extends JFrame {

  private final int tate = 5;
  private final int yoko = 5;
  private final int size = 60;
  private final int padding = 30;
  private final int max = 50;

  private JButton buttonArray[][] = new JButton[ tate ][ yoko ];
  private Container c;

  Board4() {
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    this.setTitle( "Board4" );
//    this.setSize( ( size * yoko ) + ( padding * 2 ), ( size * tate ) + ( padding * 2 ) );
    this.setLocationRelativeTo( null );
    c = this.getContentPane();
    c.setPreferredSize( new Dimension( ( size * yoko ) + ( padding * 2 ), ( size * tate ) + ( padding * 2 ) ) );
    this.pack();
    c.setLayout( null );

    ArrayList<Integer> l = new ArrayList<Integer>();
    for ( int k = 0 ; k < 99 ; k++ ) {
       l.add( k );
    }
    Collections.shuffle( l );
    for ( int i = 0, k = 0 ; i < tate ; i++ ) {
      for ( int j = 0 ; j < yoko ; j++ ) {
        buttonArray[ i ][ j ] = new JButton( Integer.toString( l.get( k++ ) + 1 ) );
        c.add( buttonArray[ i ][ j ] );
        buttonArray[ i ][ j ].setBounds( size * j + padding, size * i + padding, size, size );
      }
    }
  }

  public static void main( String[] args ) {
    Board4 gui = new Board4();
    gui.setVisible( true );
  }

}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener {
	private JButton helloButton;
	private JButton goodbyeButton;

	public ToolBar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");

		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(helloButton);
		add(goodbyeButton);

	}

	public void setTextPanel(TextPanel textPanel) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("A button has been clicked");

	}

}

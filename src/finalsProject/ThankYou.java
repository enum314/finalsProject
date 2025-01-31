package finalsProject;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ThankYou extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ThankYou() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 220, 203));
		panel.setBounds(0, 0, 557, 351);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHms = new JLabel("Booking Confirmed");
		lblHms.setBounds(137, 65, 270, 38);
		panel.add(lblHms);
		lblHms.setHorizontalAlignment(SwingConstants.CENTER);
		lblHms.setFont(new Font("Serif", Font.PLAIN, 30));

		JLabel lblHms_1 = new JLabel("Cozy Hotel");
		lblHms_1.setBounds(10, 11, 103, 23);
		panel.add(lblHms_1);
		lblHms_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHms_1.setFont(new Font("Serif", Font.PLAIN, 20));

		JLabel lblMotto = new JLabel("\"Book your stay, the perfect way.\"");
		lblMotto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotto.setBounds(328, 19, 260, 14);
		panel.add(lblMotto);
		lblMotto.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 9));

		JLabel lblNewLabel = new JLabel(
				"We are pleased to inform you that your reservation request has been received and confirmed.");
		lblNewLabel.setBounds(56, 114, 481, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblBookingDeatils = new JLabel("Booking Details");
		lblBookingDeatils.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingDeatils.setFont(new Font("Serif", Font.BOLD, 19));
		lblBookingDeatils.setBounds(56, 139, 131, 38);
		panel.add(lblBookingDeatils);

		JLabel lblBookingNo = new JLabel("Booking No.");
		lblBookingNo.setBounds(56, 173, 63, 38);
		panel.add(lblBookingNo);
		lblBookingNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingNo.setFont(new Font("Serif", Font.PLAIN, 12));

		JLabel lblThankYouBookingNum = new JLabel("New label");
		lblThankYouBookingNum.setBounds(56, 204, 63, 14);
		panel.add(lblThankYouBookingNum);
		lblThankYouBookingNum.setText("" + ContactInfo.randomNum);

		JLabel lblCheckIn = new JLabel("Check In - Out");
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("Serif", Font.PLAIN, 12));
		lblCheckIn.setBounds(175, 173, 72, 38);
		panel.add(lblCheckIn);

		JLabel lblThankYouCheckInOut = new JLabel("New label");
		lblThankYouCheckInOut.setBounds(175, 204, 46, 14);
		panel.add(lblThankYouCheckInOut);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Serif", Font.PLAIN, 12));
		lblTotal.setBounds(292, 181, 37, 23);
		panel.add(lblTotal);

		JLabel lblThankYouTotalAmount = new JLabel("New label");
		lblThankYouTotalAmount.setBounds(302, 204, 72, 14);
		panel.add(lblThankYouTotalAmount);
		lblThankYouTotalAmount.setText("" + ContactInfo.tqtotal);

		JLabel lblNewLabel_2 = new JLabel("Duration:");
		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(404, 185, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNightsStay = new JLabel("New label");
		lblNightsStay.setBounds(404, 204, 46, 14);
		panel.add(lblNightsStay);

		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(224, 324, 103, 14);
		panel.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel(
				"Thank you for choosing Cozy Hotel! We can't wait to make your stay exceptional.");
		lblNewLabel_1.setBounds(101, 305, 400, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));

		JLabel lblNewLabel_3 = new JLabel("Deatils:");
		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(56, 240, 63, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Remarks:");
		lblNewLabel_3_1.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(328, 241, 63, 14);
		panel.add(lblNewLabel_3_1);

		JLabel lblThankYouRemarks = new JLabel("");
		lblThankYouRemarks.setBounds(328, 259, 173, 35);
		panel.add(lblThankYouRemarks);

		JLabel lblThankYouAdditional = new JLabel("");
		lblThankYouAdditional.setBounds(56, 259, 46, 14);
		panel.add(lblThankYouAdditional);

		lblThankYouRemarks.setText(ContactInfo.remarks);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				checkInOut f2 = new checkInOut();
				f2.setVisible(true);
			}
		});
	}
}

package course.examples.notification.statusbarwithcustomview;

import android.app.Activity;
import android.os.Bundle;
import android.os.CancellationSignal;

public class NotificationSubActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sub_activity);
	}
}

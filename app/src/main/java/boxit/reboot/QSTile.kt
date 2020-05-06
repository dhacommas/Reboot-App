package boxit.reboot

import android.service.quicksettings.TileService
import com.topjohnwu.superuser.Shell

class QSTile : TileService() {

    override fun onClick() {
        Shell.su("svc power reboot").submit()
    }
}


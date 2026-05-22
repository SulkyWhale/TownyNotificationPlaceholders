package io.github.sulkywhale.townynotificationsplacholders;

import com.palmergames.bukkit.towny.event.ChunkNotificationEvent;
import com.palmergames.bukkit.towny.event.TitleNotificationEvent;
import com.palmergames.bukkit.towny.object.notification.TitleNotification;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TownyListener implements Listener {

    @EventHandler
    public void onChunkNotification(ChunkNotificationEvent event) {
        event.setMessage(PlaceholderAPI.setBracketPlaceholders(event.getPlayer(), event.getMessage()));
    }

    @EventHandler
    public void onTitleNotification(TitleNotificationEvent event) {
        TitleNotification titleNotification = event.getTitleNotification();

        String title = PlaceholderAPI.setBracketPlaceholders(event.getPlayer(), titleNotification.getTitleNotification());
        titleNotification.setTitleNotification(title);

        String subtitle = PlaceholderAPI.setBracketPlaceholders(event.getPlayer(), titleNotification.getSubtitleNotification());
        titleNotification.setSubtitleNotification(subtitle);
    }
}

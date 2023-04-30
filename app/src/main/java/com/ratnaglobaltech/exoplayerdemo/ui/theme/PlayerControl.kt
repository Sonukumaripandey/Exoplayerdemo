/*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Forward10
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay10
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import kotlinx.coroutines.delay

@Composable
fun PlayerControl(player: SimpleExoPlayer, modifier: Modifier = Modifier) {
    val playbackState by rememberUpdatedState(newValue = player.playbackState)
    val exoProgress = remember { mutableStateOf(0f) }
    val duration = remember { mutableStateOf(0L) }

    // Update progress and duration values
    LaunchedEffect(player) {
        while (true) {
            exoProgress.value = player.currentPosition.toFloat() / player.duration.toFloat()
            duration.value = player.duration
            delay(1000)
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    player.seekTo(player.currentPosition - 10000)
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(Icons.Filled.Replay10, contentDescription = "Backward 10 seconds")
            }

            IconButton(
                onClick = {
                    if (playbackState == Player.STATE_READY) {
                        player.pause()
                    } else {
                        player.play()
                    }
                },
                modifier = Modifier.size(64.dp)
            ) {
                if (playbackState == Player.) {
                    Icon(Icons.Filled.Pause, contentDescription = "Pause")
                } else {
                    Icon(Icons.Filled.PlayArrow, contentDescription = "Play")
                }
            }

            IconButton(
                onClick = {
                    player.seekTo(player.currentPosition + 10000)
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(Icons.Filled.Forward10, contentDescription = "Forward 10 seconds")
            }
        }

        // Show progress bar
        LinearProgressIndicator(
            progress = exoProgress.value,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        )

        // Show duration text
        Text(
            text = formatDuration(duration.value),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 8.dp, bottom = 4.dp),
            color = Color.White
        )
    }
}

private fun formatDuration(duration: Long): String {
    val seconds = duration / 1000
    val minutes = seconds / 60
    val remainingSeconds = seconds % 60
    return "%d:%02d".format(minutes, remainingSeconds)
}
*/

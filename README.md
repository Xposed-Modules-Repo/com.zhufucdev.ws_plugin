# Motion Emulator Websocket Plugin

English | [中文](https://github.com/Xposed-Modules-Repo/com.zhufucdev.ws_plugin/blob/main/README-zh.md)

This is a Motion Emulator plug-in based on WebSocket.

Motion Emulator is an Xposed-enabled location simulator with support of continuous location and sensor fake.

This module enables its Xposed functionalities over a WebSocket-based transmitting protocol.

## Usage

When in use, you should select **only** the app to be tricked.
DO NOT enable for System Framework, which is untested and highly unstable.

### Motion Emulator Installation

To use this plug-in, Motion Emulator is to be installed, which provides emulation data using WebSocket and ProtoBuf for the host app.

You can download it from [my site](https://zhufucdev.com/article/qRnydwa-LGMhGrf43tSG_) or [GitHub](https://github.com/zhufucdev/MotionEmulator/releases).

It is also possible to find it in the LSPosed repository.

### Plugin Activation

After installation, activate it in Motion Emulator. You can find a more detailed guide from [here](https://zhufucdev.com/article/0xXK6YxSWe9nGwmmHQgsa).

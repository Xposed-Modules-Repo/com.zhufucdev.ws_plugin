# 运动模拟器WebSocket插件

[English](https://github.com/Xposed-Modules-Repo/com.zhufucdev.ws_plugin/blob/main/README.md) | 中文

这是一个运基于WebSocket的动模拟器插件。

运动模拟器是一个能够使用Xposed API开展连续定位和传感器模拟的软件。

这个模块实现了它的Xposed功能，通过一种基于WebSocket的传输协议。

## 使用方法

使用的时候，应该**只选择**被欺骗的软件。**千万不要**为系统框架启用。
这种方式未经测试，并且极不稳定。

### 安装运动模拟器

要使用这个插件，需要先安装运动模拟器。它负责向宿主应用提供模拟数据，
用WebSocket和ProtoBuf。

你可以从[我的网站](https://zhufucdev.com/article/peBx_1w5Njt27VZxxQvGi)或者[GitHub](https://github.com/zhufucdev/MotionEmulator/releases)下载。

也可以从LSPosed的模块仓库找到。

### 激活插件

安装后，从运动模拟器激活这个插件。你可以在[这里](https://zhufucdev.com/article/gi0tSfKp-FIPVAAbkl64d)找到一个更为详细的教程。

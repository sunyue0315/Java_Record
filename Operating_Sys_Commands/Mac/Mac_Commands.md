# 禁用 MacOS 升级角标提醒

## 系统版本 小于 10.15.5 or 等于 10.15.6
（是的，就是这么奇怪，该策略在10.15.5中被弃用了，但在10.15.6中又放出来了，之后又去掉了，参考）
打开 终端(Terminal)

执行 sudo softwareupdate --ignore "macOS Big Sur"。如果处于 Mojave 想阻止升级到 Catalina, 把命令中的 Big Sur 改成 Catalina即可。
（如果改变主意想接收更新了，执行 sudo softwareupdate --reset-ignored即可恢复）

## 系统版本 等于 10.15.5 or 大于 10.15.6

执行: defaults write com.apple.systempreferences AttentionPrefBundleIDs 0 && killall Dock，小红点就消失了，不再提示升级了

恢复: defaults write com.apple.systempreferences AttentionPrefBundleIDs 1 && killall Dock

## 显卡切换

MacBook Pro 强制使用集成显卡以增加电池续航时间：

使用命令查看当前显卡使用状体：

```shell
pmset -g
```

查看 gpuswitch 对应值， 0：为集成显卡； 1：为独立显卡；2：为自动切换

使用命令切换：

### 强制使用集成显卡：

```shell
sudo pmset -a GPUSwitch 0
```

### 强制使用独立显卡

sudo pmset -a GPUSwitch 1


### 强制使用自动切换显卡

sudo pmset -a GPUSwitch 2

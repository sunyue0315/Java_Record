# Git 操作命令
## 代码覆盖

在使用 Git 修改时，我们有时候想要获取服务器上的最新代码，并且放弃本地修改，此时操作如下：

git fetch --all
git reset --hard origin/master  (后面是分支版本)
git pull

## 版本回退

git reset --hard HEAD^         回退到上个版本

git reset --hard HEAD~3        回退到前3次提交之前，以此类推，回退到n次提交之前

git reset --hard commit_id     退到/进到 指定commit的代码

git push origin HEAD --force   强制推到远程


@echo off
git add ./ >>../log/add.txt
git commit -m "update code" >>../log/commit.txt
git pull >> ../log/pull.txt
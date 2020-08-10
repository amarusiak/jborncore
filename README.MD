# jborncore

Quick setup — if you’ve done this kind of thing before
or	
https://github.com/amarusiak/jborncore.git
Get started by creating a new file or uploading an existing file. We recommend every repository include a README, LICENSE, and .gitignore.

…or create a new repository on the command line
echo "# jborncore" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/amarusiak/jborncore.git
git push -u origin master
                
…or push an existing repository from the command line
git remote add origin https://github.com/amarusiak/jborncore.git
git push -u origin master
…or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.

git log --all --decorate --oneline --graph
git log --graph --decorate --oneline
git log --graph --full-history --all --pretty=format:"%h%x09%d%x20%s"

git log --graph --full-history --all --color \
        --pretty=format:"%x1b[31m%h%x09%x1b[32m%d%x1b[0m%x20%s"
      
git log --graph --full-history --all --pretty=format:"%h%x09%d%x20%s"
With colors (if your shell is Bash):

git log --graph --full-history --all --color \
        --pretty=format:"%x1b[31m%h%x09%x1b[32m%d%x1b[0m%x20%s"
      
                



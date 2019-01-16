git init# multi_heroku

heroku apps
heroku info multi-hk-process-0003

Git URL:        https://git.heroku.com/multi-hk-module-0002.git
heroku git:remote -a multi-hk-module-0002

change in Procfile

Git URL:        https://git.heroku.com/multi-hk-process-0003.git
heroku git:remote -a multi-hk-process-0003

Ver plugins de un proyecto
heroku addons -a heroku-sb-test-19283746

Compartir un plugin entre proyectos
heroku addons:attach postgresql-silhouetted-31201 -a multi-hk-module-0002

curl https://multi-hk-module-0002.herokuapp.com/tapir/api/helloworld
curl https://multi-hk-module-0002.herokuapp.com/tapir/api/type/all
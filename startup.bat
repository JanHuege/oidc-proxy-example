cd oidc-frontend
call npm install
call npm run build
cd ..
cd oidc-backend
call mvn clean package -P pipeline
cd ..
call docker-compose up --build -d
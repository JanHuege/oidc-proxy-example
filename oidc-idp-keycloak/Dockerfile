FROM quay.io/keycloak/keycloak:19.0.1
# was 15.0.2
ADD import-realm.json /opt/jboss/keycloak/

#CMD ["-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-Dkeycloak.import=/opt/jboss/keycloak/import-realm.json"]
CMD ["start-dev", "-Dkeycloak.import=/opt/jboss/keycloak/import-realm.json"]

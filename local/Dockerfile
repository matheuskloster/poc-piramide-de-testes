# Use a imagem oficial do MongoDB
FROM mongo

# Exponha a porta 27017
EXPOSE 27017

# Inicialize o servidor MongoDB na porta 27017 quando o contêiner for iniciado
CMD ["mongod", "--bind_ip", "0.0.0.0"]

# Use the Nginx image as the base
FROM nginx:latest

# Author information
LABEL authors="ryanasnell"

# Copy the HTML file to the Nginx default directory
COPY ../index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start Nginx server
CMD ["nginx", "-g", "daemon off;"]
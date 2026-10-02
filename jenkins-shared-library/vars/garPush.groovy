def call(String imageFullName) {

    sh """
        echo "Publicando imagen: ${imageFullName}"

        docker push "${imageFullName}"
    """
}
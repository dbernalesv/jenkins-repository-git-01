def call(String imageFullName) {

    sh """
        echo "Publicando imagen:"
        echo "${imageFullName}"

        docker push "${imageFullName}"
    """
}
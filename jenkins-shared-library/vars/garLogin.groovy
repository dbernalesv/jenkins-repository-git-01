def call(String garHost) {

    sh """
        echo "Autenticando contra Google Artifact Registry..."

        TOKEN=\$(curl -s \
          -H "Metadata-Flavor: Google" \
          http://metadata.google.internal/computeMetadata/v1/instance/service-accounts/default/token \
          | jq -r '.access_token')

        echo "\$TOKEN" | docker login \
          -u oauth2accesstoken \
          --password-stdin \
          https://${garHost}
    """
}
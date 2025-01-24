##!/bin/bash
#
## Define your repository and owner
#REPO="classwork"
#OWNER="banjoSolomon"
#
## Loop through each line in application.properties
#while IFS= read -r line; do
#    # Skip empty lines and comments
#    [[ -z "$line" || "$line" == \#* ]] && continue
#
#    # Extract key and value
#    key=$(echo "$line" | cut -d'=' -f1)
#    value=$(echo "$line" | cut -d'=' -f2-)
#
#    # Update or add the secret in GitHub
#    echo "Updating secret: $key"
#    echo "$value" | gh secret set "$key" --repo "$OWNER/$REPO"
#done < application.properties

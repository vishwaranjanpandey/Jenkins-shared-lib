def call ( string ecrRepoName, string accountID, string region ) {
  sh """
  docker build -t ${ecrRepoName} .
  docker tag ${ecrRepoName}:latest ${accountID}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
  """
  }

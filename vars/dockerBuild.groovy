def call ( string ecr_RepoName, string aws_account_ID, string region ) {
  sh """
  docker build -t ${ecr_RepoName} .
  docker tag ${ecr_RepoName}:latest ${aws_account_ID}.dkr.ecr.${region}.amazonaws.com/${ecr_RepoName}:latest
  """
  }

def call (String ecr_RepoName, String aws_account_ID, String region ) {
  sh """
  docker build -t ${ecr_RepoName} .
  docker tag ${ecr_RepoName}:latest ${aws_account_ID}.dkr.ecr.${region}.amazonaws.com/${ecr_RepoName}:latest
  """
  }

node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/libxml2port.git'), string(name: 'PORT_DESCRIPTION', value: 'The XML C parser and toolkit of Gnome' )]
  }
}
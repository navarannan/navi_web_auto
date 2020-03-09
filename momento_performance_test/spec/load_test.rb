$LOAD_PATH.unshift(File.join(File.dirname(__FILE__), '..', 'lib'))
require 'ruby-jmeter'

test do
  threads count: 1000, duration: 5 do
    visit name: 'Home Page', url: 'http://google.com/' do
    end
  end
end.run(
    path: 'C:/apache-jmeter-5.2.1/bin',
    file: 'jmeter.jmx',
    log: 'jmeter.log',
    jtl: 'results.jtl',
    properties: 'jmeter.properties')